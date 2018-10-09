function scrollto() {
  $("html, body").animate({ scrollTop: window.pageYOffset - 50 },500);

  if (window.innerWidth < 1100) {
    $(".navdesktop").animate({marginTop:-475},200);
  }
}


window.addEventListener('hashchange', scrollto);

$(document).ready(function(){
    $(".navmoblie").click(function(){

    var fensterbeite = parseInt(window.innerWidth);
    var ausgeklappt = parseInt($(".navdesktop").css("margin-top"));

    if ( fensterbeite < 1100) {
      if( ausgeklappt < -1) {
        $(".navdesktop").animate({marginTop:0},200);
      }else{
        $(".navdesktop").animate({marginTop:-475},200);

      }
    }
    });
});
