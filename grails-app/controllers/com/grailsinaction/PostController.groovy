package com.grailsinaction

class PostController {
    static scaffold = true
	
	def timeline(){
		def user = User.findByLoginId(params.id)
		if(user){
			[user : user]
		}else{
			response.sendError(404)
		}
	}
}
