package com.grailsinaction

import grails.test.mixin.TestFor
import spock.lang.Specification
import grails.test.mixin.Mock

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PostController)
@Mock([User, Post])
class PostControllerSpec extends Specification {

	def setup() {
	}

	def cleanup() {
	}

	def "Get a users timeline given their id"(){
		given: "A user with posts in the db"
		User chuck = new User(loginId: "chuck_norris", password: "password").save(failOnError: true)
		chuck.addToPosts(new Post(content: "A first post"))
		chuck.addToPosts(new Post(content: "A second post"))
		
		and: "A loginId parameter"
		params.id = chuck.loginId
		
		when: "the timeline is invoked"
		def model = controller.timeline()
		
		then: "the user is in the returned model"
		model.user.loginId == "chuck_norris"
		model.user.posts.size() == 2
	}
}