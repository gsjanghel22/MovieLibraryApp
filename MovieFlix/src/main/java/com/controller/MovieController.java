package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.model.Movie;
import com.model.MovieRepository;

@Controller
public class MovieController {
	
	/*
	 * public long movieCollection1; public long movieCollection2;
	 */

	@Autowired
	MovieRepository movieRepository;
	
	
	@GetMapping("/byMovieID")
	public String byMovieID() {
		return "byMovieId";
	}

	@GetMapping("/byMovieName")
	public String byMovieName() {
		return "byMovieName";
	}

	@GetMapping("/byMovieCollection")
	public String byMovieCollection() {
		return "byMovieCollection";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

	@PostMapping("/checkadmin")
	public String checkadmin(@ModelAttribute("userId") String userId,
			@ModelAttribute("userPassword") String userPassword) {
		System.out.println(userId + " " + userPassword);
		if (userId.equals("gaurav@gmail.com") && userPassword.equals("spectacular"))
			return "success";
		else
			return "fail";
	}

	@GetMapping("/addmovie")
	public String addmovie() {
		return "addmovie";
	}

	@GetMapping("/modifymovie")
	public String modifymovie() {
		return "modifymovie";
	}

	@ResponseBody
	@PostMapping("/add")
	public String addAccount(@ModelAttribute("movieId") String movieId, @ModelAttribute("movieName") String movieName,
			@ModelAttribute("movieCollection") Long movieCollection) {
		Optional<Movie> m1=movieRepository.findById(movieId);
		System.out.println(m1.isPresent());
		if(m1.isPresent())
		{
			return "<html><body bgcolor='coral'>Movie already exist<br><a href='index.html'>home</a></body></html>";
		
		}
		else
		{
			Movie m = new Movie(movieId, movieName, movieCollection);
			movieRepository.save(m);
			return "<html><body bgcolor='coral'>Movie Added Successfully<br><a href='index.html'>home</a></body></html>";
		}
	}

	@ResponseBody
	@PostMapping("/getmoviebyId")
	public Optional<Movie> getMovieById(@ModelAttribute("movieId") String movieId) {
		System.out.println("Inside the getReview Controller method" + movieId);
		return movieRepository.findById(movieId);
	}
	


	@PostMapping("/getmoviebyname")
	public ModelAndView getMovieByName(@ModelAttribute("movieName") String movieName) {
		ModelAndView mv= new ModelAndView();
		List<Movie> mname= movieRepository.findBymovieNameLike(movieName);
		
		if(mname.isEmpty()==false) {
			List<Movie> mname1= movieRepository.findBymovieNameLike("%"+movieName+"%");
		mv.addObject("list",mname1);
		mv.setViewName("moviename");
		}
		
		else {
			mv.addObject("result","Sorry");
			mv.setViewName("nomoviename");
			
		}
		return mv;
	}
    
	@PostMapping("/getmoviebycollection") 
	  public ModelAndView getMovieByCollection(@ModelAttribute("movieCollection1")
	  long movieCollection1, @ModelAttribute("movieCollection2") long movieCollection2){
	  
	  ModelAndView mv = new ModelAndView(); 
	  Iterable<Movie> result = movieRepository.findByCollection(movieCollection1, movieCollection2);
	  
	  mv.addObject("list",result); 
	  mv.setViewName("collection"); 
	  return mv; 
	  }

	@GetMapping("/check")
	public String check() {
		return "movie";
	}

	@GetMapping("/getAll")
	public ModelAndView display() {
		ModelAndView mv = new ModelAndView();
		Iterable<Movie> result = movieRepository.findAll();
		mv.addObject("list", result);
		mv.setViewName("moviename");
		System.out.println("end");
		return mv;
	}
}
