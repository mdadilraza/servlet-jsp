package controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.ProductDao;
import dto.Product;

public class SaveProduct extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String prodName = req.getParameter("productName");
		String prodBrand = req.getParameter("productBrand");

		String prodManufacturer = req.getParameter("productManufacturer");
		String prodState = req.getParameter("state");
		double prodPrice = Double.parseDouble(req.getParameter("productPrice"));
		Product product = new Product();
		product.setProductName(prodName);
		product.setProductBrand(prodBrand);
		product.setProductManufacturer(prodManufacturer);
		product.setProductState(prodState);

		if (prodState.equals("Telangana")) {
			ServletContext servletContext=getServletContext() ; 
			double CGST= Double.parseDouble(servletContext.getInitParameter("CGST"));
			
			ServletConfig config=getServletConfig();
			
			double SGST= Double.parseDouble(config.getInitParameter("TN_SGST"));
			
			double total_Price=prodPrice+ (CGST+SGST )*prodPrice;
			product.setProductPrice(total_Price);
			
		} else {
			ServletContext servletContext=getServletContext() ; 
			double CGST= Double.parseDouble(servletContext.getInitParameter("CGST"));
			
			ServletConfig config=getServletConfig();
			
			double SGST= Double.parseDouble(config.getInitParameter("AP_SGST"));
			
			double total_Price=prodPrice+ (CGST+SGST )*prodPrice;
			product.setProductPrice(total_Price);
			
			
		}

		
		

		ProductDao productDao = new ProductDao();
		productDao.saveProduct(product);
		
		PrintWriter printWriter=res.getWriter();
		printWriter.println("successfully product Added");

	}

}
