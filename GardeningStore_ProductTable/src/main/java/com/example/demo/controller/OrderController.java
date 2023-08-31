package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.OrderService;
import com.example.demo.model.Ordermodel;
//import com.example.demo.model.Prodect;
//import com.example.demo.model.Prodect;

@RestController
public class OrderController {
@Autowired
OrderService sser;
@PostMapping("addorder")
public Ordermodel adddetails(@RequestBody Ordermodel ss)
{
	return sser.saveinfo(ss);
}
@PostMapping("addorderlist")
public List<Ordermodel> addlist (@RequestBody List<Ordermodel> ss)
{
	return sser.arraysaveinfo(ss);
}
@GetMapping("showorder")
public List<Ordermodel> showdetail()
{
	return sser.showinfo();
}
@GetMapping("showidorder/{id}")
public Optional<Ordermodel> showbyid(@PathVariable int id)
{
	return sser.showninfo(id);
}
@PutMapping("updateorder")
public Ordermodel updatedetail(@RequestBody Ordermodel ss)
{
	return sser.updateinfo(ss);
}
@PutMapping("updateidorder/{id}")
public String updatenid(@PathVariable int id,@RequestBody Ordermodel ss)
{
	return sser.updateinfobyid(id,ss);
}
@DeleteMapping("Deleteorder")
public String deletedetails(@RequestBody Ordermodel ss)
{
	sser.deleteinfo(ss);
	return "deleted succesfully";
}
@DeleteMapping("deleteidorder/{id}")
public void deterByid(@PathVariable int id)
{
	sser.deleteid(id);
	
}
@GetMapping("sortorder/{name}")
public List<Ordermodel> getsortorder(@PathVariable String name)
{
	return sser.sortorder(name);
}
@GetMapping("pagingordern/{pageno}/{pagesize}")
public List<Ordermodel> showpageinfoorder(@PathVariable int pageno,@PathVariable int pagesize)
{
	//sser.sortinfo(name);
	return sser.getbypageorder(pageno, pagesize);
}
@GetMapping("pagingorder/{pageno}/{pagesize}/{s}")
public List<Ordermodel> showpageinfonorder(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String s)
{
	return sser.sortpagingorder(pageno,pagesize,s);
}
}
