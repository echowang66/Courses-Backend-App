package com.bytecaptain.exception;

public class LessonNotFoundException extends RuntimeException{
    // what is the function of this instance variable
    private static final long serialVersionUID = 179856888745840942L;
    public LessonNotFoundException(Long id){
        super("Lesson id not found : " + id);
    }
    public LessonNotFoundException(String message, Long id) {
        super("Lesson id not found : " + id + "TODO" + message);
    }


}
