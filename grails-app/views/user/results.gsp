<html>
	<head>
		<title>Search Results</title>
		<meta name="layout" content="main" />
	</head>
	<body>
		<h1>Results</h1>
		<p>
			Search ${totalUsers} records
			for items matching <em>${term}</em>.
			Found <strong>${users.size()}</strong> hits.
		</p>
		<ul>
		<g:each var="user" in="${users}">
			<li>${user.loginId}</li>
		</g:each>
		</ul>
		<g:link action="search">search Again</g:link>
	</body>
</html>