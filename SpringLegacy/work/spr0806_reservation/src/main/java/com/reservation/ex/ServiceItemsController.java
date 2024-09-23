package com.reservation.ex;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.reservation.dto.AuthoritiesDto;
import com.reservation.dto.ServiceItemsDto;
import com.reservation.service.IAuthoritiesService;
import com.reservation.service.IServiceItemsService;

@Controller
public class ServiceItemsController {

   @Autowired
   private IServiceItemsService itemService;

   private static final Logger logger = LoggerFactory.getLogger(ServiceItemsController.class);

   @RequestMapping(value = "/file/fileUpload", method = RequestMethod.GET)
   public String UploadPage() {
      return "/file/fileUpload";

   }


   @RequestMapping(value = "/file/updateDB", method = RequestMethod.POST)
   public String updateDB(ServiceItemsDto dto) {

      //itemService.
      return "file/upload_ok";

   }
   
   @RequestMapping(value = "/file/UploadDB", method = RequestMethod.POST)
   public String fileUpload(@RequestParam("file") MultipartFile file) {
      String fileRealName = file.getOriginalFilename();
      long size = file.getSize();

      System.out.println("파일 이름" + fileRealName);
      System.out.println("용량 크기(byte): " + size);

      String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."), fileRealName.length());
      String uploadFolder = "C:\\groot\\upload";
      UUID uuid = UUID.randomUUID();
      System.out.println(uuid.toString());
      String[] uuids = uuid.toString().split("-");

      String uniqueName = uuids[0];
      System.out.println("생성된 고유문자열 : " + uniqueName);
      System.out.println("확장자명 :" + fileExtension);

      // File saveFile = new File(uploadFolder+"\\"+fileRealName); uuid 적용 전

      File saveFile = new File(uploadFolder + "\\" + uniqueName + fileExtension); // 적용 후
      try {
         file.transferTo(saveFile); // 실제 파일 저장메서드(filewriter 작업을 손쉽게 한방에 처리해준다.)
      } catch (IllegalStateException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return "file/upload_ok";

   }

}