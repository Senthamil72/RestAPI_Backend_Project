package com.example.demo.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProductRepo;
//import com.example.demo.model.Child;
//import com.example.demo.model.Ordermodel;
import com.example.demo.model.Prodect;

@Service
public class ProdectService {

	@Autowired
	ProductRepo sr;
	public Prodect saveinfo(Prodect ss)
	{
		return sr.save(ss);
	}
	public List<Prodect> arrayProdectsaveinfo(List<Prodect> ss)
	{
		return sr.saveAll(ss);
	}
	public List<Prodect> showinfo()
	{
		return sr.findAll();
	}
	public Optional<Prodect> showninfo(int id)
	{
		return sr.findById(id);
	}
	
	public Prodect updateinfo(Prodect ss)
	{
		return sr.saveAndFlush(ss);
	}
	public String updateinfobyid(int id,Prodect ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	public void deleteinfo(Prodect ss)
	{
		sr.delete(ss);
	}
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
	public List<Prodect> sortinfo(String s)
	{
		return sr.findAll(Sort.by(Sort.Direction.DESC,s));
	}
	public List<Prodect> getbypage(int pgno,int pgsize)
	{
		//sr.findAll(Sort.by(Sort.Direction.DESC,s));
		Page<Prodect>p=sr.findAll(PageRequest.of(pgno,pgsize));
		return p.getContent();
	}
	public List<Prodect>sortpaging(int pgno,int pgsize,String str)
	{
		Page<Prodect>p=sr.findAll(PageRequest.of(pgno,pgsize,Sort.by(str)));
		return p.getContent();
	}
	public List<Prodect>getidinfo(int id)
	{
		return sr.getid(id);
	}
	public List<Prodect> getnameinfo(String productname)
	{
		return sr.getname(productname);
	}
	public List<Prodect> getpriceinfo(String price)
	{
		return sr.getprice(price);
	}
	public String deleteidinfo(int id)
	{
		return sr.deleteid(id)+"Deleted";
	}
	public String updateidinfo(int id)
	{
		return sr.updateid(id)+"Updated";
	}
}
