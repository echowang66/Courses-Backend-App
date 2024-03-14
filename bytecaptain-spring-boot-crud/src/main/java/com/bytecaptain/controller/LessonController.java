package com.bytecaptain.controller;
/**
@RestController
public class LessonController {
    
    @Autowired
    private LessonService lessonService;
    @GetMapping("/instructor/{username}/lessons")
    public List<Lesson> getAllLessons(@PathVariable String username) {
        List<Lesson> lessons = lessonService.getAllLessons(username);
        return lessons;
    }
    @GetMapping("/instructors/{username}/lessons/{id}")
    public Lesson getLesson(@PathVariable String username, @PathVariable long id){
        Lesson lesson = lessonService.getLesson(username, id);
        return lesson;
    }
    @DeleteMapping("instructor/{username}/lessons/{id}")
    public ResponseEntity<Void> deleteLesson(@PathVariable String username, @PathVariable long id) {
        lessonService.deleteLesson(username, id);
        ResponseEntity<Void> responseEntity = ResponseEntity.noContent().build();
        return responseEntity;
    }
    @PutMapping("instructor/{username}/lessons/{id}")
    public ResponseEntity<Lesson> updateLesson(@PathVariable String username , @PathVariable long id,
      @RequestBody Lesson lesson){
        lesson.setUsername(username);
        Lesson lessonUpdated = lessonService.updateLesson(username, id);
        ResponseEntity<Lesson> responseEntity = new ResponseEntity<Lesson>( lessonUpdated, HttpStatusCode.OK);
        return responseEntity;
    }
 
}
*/
