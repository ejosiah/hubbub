package com.grailsinaction

import groovy.transform.ToString;

@ToString
class User {
	String loginId
	String password
	Date dateCreated
	static hasOne = [profile : Profile]
	static hasMany = [posts : Post, tags: Tag, following : User]

    static constraints = {
		loginId size: 3..20, unique: true
		password size: 6..8
		validator: { passwd, me -> passwd != me.loginId }
		profile nullable: true
    }
	
	String getDisplayString(){ loginId }
	
	static mapping = {
		posts sort : 'dateCreated'
	}
}
