package edu.eci.cnyt;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ComplexController {
	
	
	
	@GetMapping("/suma/{num1a}/{num1b}/{num2a}/{num2b}")
    public ResponseEntity<?> suma(@PathVariable("num1a") int num1a,@PathVariable("num1b") int num1b, @PathVariable("num2a") int num2a, @PathVariable("num2b") int num2b){
        System.out.println("namehola");
        try{
        	ComplexNumber c1 = new ComplexNumber(num1a,num1b);
        	ComplexNumber c2 = new ComplexNumber(num2a,num2b);
        	ComplexNumber cAddResult = c1.add(c2);
        	Double cAddReal = cAddResult.getParteReal();
        	Double cAddImg = cAddResult.getParteImaginaria();
        	String result = "{\"real\":\""+cAddReal+"\",\"img\":"+cAddImg+"}";
            return new ResponseEntity<>(result,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	@GetMapping("/resta/{num1a}/{num1b}/{num2a}/{num2b}")
    public ResponseEntity<?> resta(@PathVariable("num1a") int num1a,@PathVariable("num1b") int num1b, @PathVariable("num2a") int num2a, @PathVariable("num2b") int num2b){
        System.out.println("resta");
        try{
        	ComplexNumber c1 = new ComplexNumber(num1a,num1b);
        	ComplexNumber c2 = new ComplexNumber(num2a,num2b);
        	ComplexNumber cAddResult = c1.substract(c2);
        	Double cAddReal = cAddResult.getParteReal();
        	Double cAddImg = cAddResult.getParteImaginaria();
        	String result = "{\"real\":\""+cAddReal+"\",\"img\":"+cAddImg+"}";
            return new ResponseEntity<>(result,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	@GetMapping("/mult/{num1a}/{num1b}/{num2a}/{num2b}")
    public ResponseEntity<?> multiplicacion(@PathVariable("num1a") int num1a,@PathVariable("num1b") int num1b, @PathVariable("num2a") int num2a, @PathVariable("num2b") int num2b){
        System.out.println(num1a);
		System.out.println("multiplicacion");
        try{
        	ComplexNumber c1 = new ComplexNumber(num1a,num1b);
        	ComplexNumber c2 = new ComplexNumber(num2a,num2b);
        	ComplexNumber cAddResult = c1.multiplication(c2);
        	Double cAddReal = cAddResult.getParteReal();
        	Double cAddImg = cAddResult.getParteImaginaria();
        	String result = "{\"real\":\""+cAddReal+"\",\"img\":"+cAddImg+"}";
            return new ResponseEntity<>(result,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	@GetMapping("/div/{num1a}/{num1b}/{num2a}/{num2b}")
    public ResponseEntity<?> division(@PathVariable("num1a") int num1a,@PathVariable("num1b") int num1b, @PathVariable("num2a") int num2a, @PathVariable("num2b") int num2b){
        System.out.println("division");
        try{
        	ComplexNumber c1 = new ComplexNumber(num1a,num1b);
        	ComplexNumber c2 = new ComplexNumber(num2a,num2b);
        	ComplexNumber cAddResult = c1.division(c2);
        	Double cAddReal = cAddResult.getParteReal();
        	Double cAddImg = cAddResult.getParteImaginaria();
        	String result = "{\"real\":\""+cAddReal+"\",\"img\":"+cAddImg+"}";
            return new ResponseEntity<>(result,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	

}
