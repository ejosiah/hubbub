package com.grailsinaction

import org.springframework.dao.DataIntegrityViolationException

class UserController {

    static allowedMethods = [search: "GET", results: "POST"]
	static scaffold = true
	
    def index() {
        redirect(action: "list", params: params)
    }
	
	def search(){}
	
	def results(String query){
		def users = User.where{ loginId =~ "%${query}%" }.list()
		return [users : users, term: params.loginId, totalUsers: User.count()]
	}

}
