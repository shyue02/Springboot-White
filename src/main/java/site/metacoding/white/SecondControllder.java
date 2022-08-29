package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//데이터 받기
//GET -> QueryString, PathVariable(PK) = Form(GET) = 브라우저(주소 뒤에 ? 붙이기)
//POST,PUT -> 데이터 넣어줘 수정해줘 -> http body 담아준다 -> Form(POST) -> JS
//DELETE -> http body가 없음 -> QueryString, PathVariable

@RestController
public class SecondControllder {
	@GetMapping("/second/{id}") //pk(id)가 1인 것을 찾고 싶음
	public String getData(@PathVariable Integer id) {
		return "id :"+id;
	}
	
	//QueryString = x-www-머시기 타입이다
	@GetMapping("/second")
	public String getData2(String title, String content) {
		return "title : " +title +", content : " +content;
	}
	
	// BR -> title=제목&content==내용, x-www머시기
	@PostMapping("/second")
	public String getData(String title, String content) { // 스프링 파싱 기본 전략 : x-www-form-머시기
		return "title : " +title +", content : " +content;
	}
	
	@PutMapping("/second")
	public String putData(String title, String content) {
		return "title : " +title +", content : " +content;
	}
	
	@DeleteMapping("/second")
	public String deleteData(@PathVariable Integer id) {
		return id +"delete ok";
	}
}
