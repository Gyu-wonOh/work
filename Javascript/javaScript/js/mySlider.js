window.onload=function(){
    //var img=[img/1.jpg,img/2.jpg,img/3.jpg];
    var sliderImgs=document.getElementById("mySlider").getAttribute("data-imglist");
    //슬라이더에서 사용할 이미지 배열 제작
    sliderImgs=eval(sliderImgs);
    console.log(sliderImgs);
    console.log(sliderImgs[0]);
    //슬라이더를 실행할 이미지 얻어오기
    var myslider=document.getElementById("holder");
    var index=0;

    document.getElementById("prev").addEventListener("click",function(){
        if(index==0){
            index=sliderImgs.length;
        }
        index=index-1;
        myslider.src=sliderImgs[index];
        return false;
    })
    document.getElementById("next").addEventListener("click",function(){
        index=index+1;
        index=index%sliderImgs.length;
        myslider.src=sliderImgs[index];
    })
}