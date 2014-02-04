package hubbub

class Utility {
	
	static main(args){
		def path = 'https://raw2.github.com/GrailsInAction/graina2/master/ch04/hubbub/web-app/images/headerlogo.png'
		URL url = path.toURL()
		def name = path[(path.lastIndexOf('/')+1)..<path.size()]
		File img = new File("C:\\Users\\jay\\workspace\\hubbub\\web-app\\images\\$name")
		println img
		img.withOutputStream { os -> url.eachByte{ os.write it } }
		println 'done'
	}
}
