package com.reservation.ex;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.reservation.dto.BusinessPlaceInfoDto;
import com.reservation.dto.SelectedItemsDto;
import com.reservation.dto.ServiceItemsDto;
import com.reservation.dto.UserDto;
import com.reservation.dto.VendorDto;
import com.reservation.dto.VendorUserDto;
import com.reservation.dto.cardObjDto;
import com.reservation.service.IBusinessPlaceInfoService;
import com.reservation.service.IServiceItemsService;
import com.reservation.service.IUserService;
import com.reservation.service.IVendorService;
import com.reservation.service.IVendorUserService;


@Controller
public class MemberController {

	@Autowired
    PasswordEncoder passwordEncoder;
	
	@Autowired
	private IUserService uService;
	
	@Autowired
	private IVendorService vService;
	
	@Autowired
	private IBusinessPlaceInfoService bPIService;
	
	@Autowired
	private IServiceItemsService sIService;

	@Autowired
	private IVendorUserService vUService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/member/member", method = RequestMethod.GET)
	public String member(HttpSession session, Model model) throws Exception {
		System.out.println("MemberController - /member/member");
		//LoginRedirectHandler.java
		String email = (String)session.getAttribute("loginEmail");
		if(session.getAttribute("loginName")==null) {
			UserDto dto = uService.selectEmail(email);
			session.setAttribute("loginName", dto.getName());
			session.setAttribute("loginPhone", dto.getPhone());
			//위 2가지는 header.jsp에 숨겨져있어서 필요시 id로 접근가능
			//<input type="hidden" id="loginEmail" value="${sessionScope.loginEmail}">
			//<input type="hidden" id="loginName" value="${sessionScope.loginName}">
			//<input type="hidden" id="loginPhone" value="${sessionScope.loginPhone}">
			
		}
		
		return "/member/member";
	}
	
//0822
	@RequestMapping(value = "/member/update", method = RequestMethod.GET)
	public String memberUpdate(HttpSession session, Model model) throws Exception {
		System.out.println("MemberController - /member/update(get)");
		//select,set
		UserDto dto = uService.selectEmail((String)session.getAttribute("loginEmail"));
		model.addAttribute("userDto", dto);
		System.out.println(dto);
		return "/member/update";
	}
//0822
	@RequestMapping(value = "/member/update", method = RequestMethod.POST)
	public String memberUpdateDB(UserDto dto, HttpSession session, Model model) throws Exception {
		System.out.println("MemberController - /member/update(post)");
		String encPassword = passwordEncoder.encode(dto.getPassword());
		dto.setPassword(encPassword);
		uService.update(dto);
		System.out.println(dto);
		return "redirect:/user/login?update";
	}
	
	
	
	@RequestMapping(value = "/member/searchplace", method = RequestMethod.GET)
    public String searchplace(Model model, HttpSession session) throws Exception {
        logger.info("MemberController - /member/searchplace");
        
        // 세션에서 검색 결과를 가져옴
        List<VendorDto> vendorList = (List<VendorDto>) session.getAttribute("vendorList");
        
        // 검색 결과를 모델에 추가
        if (vendorList != null) {
            model.addAttribute("vendorList", vendorList);
            //session.removeAttribute("vendorList"); // 검색 결과 사용 후 세션에서 제거
        }
        //System.out.println("aaaaaaaaaaa   " + vendorList);
        
        return "member/searchplace";
    }
	
	@RequestMapping(value = "/member/searchplacebt", method = RequestMethod.POST)
    public String searchplaceDB1(@RequestParam("business_type") String businessType, Model model, HttpSession session) throws Exception {
        logger.info("MemberController - /member/searchplacebtype   business_type " + businessType);
        List<VendorDto> vendorList = vService.selectAllVendorByBusinessType(businessType);
        session.setAttribute("vendorList", vendorList);	//검색결과를 세션에 저장해두고
        return "redirect:searchplace";					//리다이렉트로 이동해야 뒤로가기 해도 문제가 없음
        
//        model.addAttribute("vendorList", vendorList);
//        return "member/searchplace";
    }
    
    @RequestMapping(value = "/member/searchplaceba", method = RequestMethod.POST)
    public String searchplaceDB2(@RequestParam("basic_address") String basicAddress, Model model, HttpSession session) throws Exception {
        logger.info("MemberController - /member/searchplacebaddr   basicAddress " + basicAddress);
        List<VendorDto> vendorList = vService.selectAllVendorByBasicAddress(basicAddress);
        session.setAttribute("vendorList", vendorList);	//검색결과를 세션에 저장해두고
        return "redirect:searchplace";					//리다이렉트로 이동해야 뒤로가기 해도 문제가 없음
    }
    

    @RequestMapping(value = "/member/mmonthlyschedule", method = RequestMethod.GET)
    public String mMonthlySchedule(Model model, HttpSession session) throws Exception {
    	logger.info("MemberController - /member/mmonthlyschedule");
    	
		return "member/mmonthlyschedule";
    	
    }
    
	@RequestMapping(value = "/member/mdailyschedule", method = RequestMethod.GET)
    public String DailySchedule(@RequestParam("date") String date, HttpSession session, Model model) {
		System.out.println("MemberController - /member/dailyschedule(get) selectedDate:" + date);
		
//		String email = (String)session.getAttribute("loginEmail");
//		String business_regi_num = (String)session.getAttribute("loginBusiness_regi_num");
//		String open_date = (String)session.getAttribute("open_date");
		model.addAttribute("selectedDate", date);
		//System.out.println(date);
		return "/member/mdailyschedule";
    }
	
    @RequestMapping(value = "/member/businessplaceinfo", method = RequestMethod.GET)
    public String businessplaceinfo(
            @RequestParam("email") String email,
            @RequestParam("business_regi_num") String business_regi_num,
            Model model, HttpSession session) throws Exception {
        logger.info("MemberController - /member/businessplaceinfo: email=" + email + ", business_regi_num=" + business_regi_num);

        BusinessPlaceInfoDto placeInfo = bPIService.selectOneBusinessPlaceInfo(email, business_regi_num);
        model.addAttribute("placeInfo", placeInfo);
        
        //벤더 정보 세션에 저장 주문성립시에 가져다 씀
        VendorUserDto vendorUserDto = vUService.selectOneVendorEmailBusinessRegiNum(email, business_regi_num);
        //VendorUserDto vendorUserDto = vUService.selectOne();
        session.setAttribute("vendorInfo", vendorUserDto);
        System.out.println("vendorInfo : " + vendorUserDto);
        
        List<ServiceItemsDto> serviceItems = sIService.selectAllYourItems(email, business_regi_num);
        model.addAttribute("serviceItems", serviceItems);
        
        return "member/businessplaceinfo";
    }
	

	@RequestMapping(value = "/member/mscheduleselect", method = RequestMethod.GET)
	public String memberScheduleselect(
			@RequestParam("date") String date,
	        Model model) {
		////////////
//        model.addAttribute("vendorEmail", email);
//        model.addAttribute("vendorBusiness_regi_num", business_regi_num);
		model.addAttribute("selectedDate", date);
		System.out.println("MemberController - /member/mscheduleselect(get)");
		return "/member/mscheduleselect";
	}
	
	@RequestMapping(value = "/member/mreservationconfirm", method = RequestMethod.GET)
	public String membermReservationConfirm(
	        Model model) {
		////////////
//        model.addAttribute("vendorEmail", email);
//        model.addAttribute("vendorBusiness_regi_num", business_regi_num);
		System.out.println("MemberController - /member/mreservationconfirm(get)");
		return "/member/mreservationconfirm";
	}
	
	

	
	@RequestMapping(value = "/member/membertovendor", method = RequestMethod.GET)	//user의 권한에서 vendor로 변환하려는것이기때문에 일단 UserController에 넣어둠
	public String memberMembertovendor(Locale locale, Model model) {
		System.out.println("MemberController - /member/membertovendor(get)");
		return "/member/membertovendor";
	}
	
	
	@RequestMapping(value = "/member/membertovendor", method = RequestMethod.POST)	//user의 권한에서 vendor로 변환하는것이기때문에 일단 UserController에 넣어둠
	public String memberMembertovendorDB(VendorDto dto, RedirectAttributes rttr) throws Exception{
		System.out.println("MemberController - /member/membertovendor(post)");
		vService.insert(dto); 		// 일반member vendor전환시,  vendor table에  vendor 정보 insert되고  
		System.out.println(dto);	// authorities table에  ROLE_MEMBER가  ROLE_VENDOR 로 update 됨     VeendorServiceImpl구현부. 트렌젝션 처리 o
		rttr.addAttribute("vendor",true);
		return "redirect:/user/logout";	// 그냥 로그아웃 땡 돼서 뭔가 좀 부자연스러움. 사업자회원전환되엇으니 새로 로그인하라고 보여줘야함
	}
	
	
	
	
	
}
