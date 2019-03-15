package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;

public class CadastraUsuarioServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(request.getParameter("name"));
		
	
		request.getParameter("tel");
		pessoa.setTelefone(request.getParameter("tel"));
		
		request.getParameter("email");
		pessoa.setEmail(request.getParameter("email"));
		
		request.getParameter("end");
		pessoa.setEndereco(request.getParameter("end"));
		
		
	}
}
