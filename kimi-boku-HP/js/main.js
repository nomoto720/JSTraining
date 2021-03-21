jQuery(function($){
  $(window).on('load scroll', function(){
    if ($(window).scrollTop() < 1090) {
      $('.topPage').fadeIn(400);
    } else {
      $('.topPage').fadeOut(400);
    }
  });
});

jQuery(function($){
  $(window).on('load scroll', function(){
    if ($(window).scrollTop() > 1090 &&$(window).scrollTop() < 2045){
      $('.storyPage').fadeIn(100);
    } else {
      $('.storyPage').fadeOut(100);
    }
  });
});

jQuery(function($){
  $(window).on('load scroll', function(){
    if ($(window).scrollTop() > 2045 &&$(window).scrollTop() < 2220){
      $('.castPage').fadeIn(100);
    } else {
      $('.castPage').fadeOut(100);
    }
  });
});

jQuery(function($){
  $(window).on('load scroll', function(){
    if ($(window).scrollTop() > 2220 ){
      $('.gallery').fadeIn(100);
    } else {
      $('.gallery').fadeOut(100);
    }
  });
});

$(function(){
  $('a[href^="#"]').click(function(){
    var speed = 1000;
    var href= $(this).attr("href");
    var target = $(href == "#" || href == "" ? 'html' : href);
    var position = target.offset().top;
    $("html, body").animate({scrollTop:position}, speed, "swing");
    return false;
  });
});
