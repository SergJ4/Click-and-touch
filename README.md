# Click-and-touch

This project is for my blog post: https://www.droid-lark.com/post/clicks-touches

Logs for fragment branch:

CustomView IN ACTIVITY CLICKED WHEN FRAGMENT IN FRONT OF IT:  
Activity dispatchTouchEvent, event: ACTION_DOWN  
CustomConstraintLayout dispatchTouchEvent, event: ACTION_DOWN  
CustomConstraintLayout onInterceptTouchEvent, event: ACTION_DOWN  

CustomConstraintLayout dispatchTouchEvent, event: ACTION_DOWN  
CustomConstraintLayout onInterceptTouchEvent, event: ACTION_DOWN  
CustomConstraintLayout onTouchEvent, event: ACTION_DOWN  
CustomFrameLayout dispatchTouchEvent, event: ACTION_DOWN  
CustomFrameLayout onInterceptTouchEvent, event: ACTION_DOWN  
CustomView dispatchTouchEvent, event: ACTION_DOWN  
CustomView onTouchEvent, event: ACTION_DOWN  

Activity dispatchTouchEvent, event: ACTION_UP  
CustomConstraintLayout dispatchTouchEvent, event: ACTION_UP  
CustomConstraintLayout onInterceptTouchEvent, event: ACTION_UP  
CustomFrameLayout dispatchTouchEvent, event: ACTION_UP  
CustomFrameLayout onInterceptTouchEvent, event: ACTION_UP  
CustomView dispatchTouchEvent, event: ACTION_UP  
CustomView onTouchEvent, event: ACTION_UP  

CustomView clicked  

CustonFrameLayout INSIDE FRAGMENT CLICKED:  
Activity dispatchTouchEvent, event: ACTION_DOWN  
CustomConstraintLayout dispatchTouchEvent, event: ACTION_DOWN  
CustomConstraintLayout onInterceptTouchEvent, event: ACTION_DOWN  
CustomConstraintLayout dispatchTouchEvent, event: ACTION_DOWN  
CustomConstraintLayout onInterceptTouchEvent, event: ACTION_DOWN  
CustomFrameLayout dispatchTouchEvent, event: ACTION_DOWN  
CustomFrameLayout onInterceptTouchEvent, event: ACTION_DOWN  
CustomFrameLayout onTouchEvent, event: ACTION_DOWN  
CustomConstraintLayout onTouchEvent, event: ACTION_DOWN  
CustomConstraintLayout onTouchEvent, event: ACTION_DOWN  
Activity onTouchEvent, event: ACTION_DOWN  

Activity dispatchTouchEvent, event: ACTION_UP  
Activity onTouchEvent, event: ACTION_UP  
