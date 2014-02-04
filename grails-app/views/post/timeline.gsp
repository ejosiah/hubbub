<html>
	<head>
		<title>hubbub Timeline for ${user.loginId}</title>
		<meta name="layout" content="main" />
	</head>
	<body>
		<h1>Timeline for ${user.profile ? user.profile.fullName : user.loginId }</h1>
		<div class="allPosts">
			<g:each var="post" in="${user.posts}">
			<div class="postEntry">
				<div class="postText">
					${post.content}
				</div>
				<div class="postDate">
					${post.dateCreated}
				</div>
			</div>
			</g:each>
		</div>
	</body>
</html>