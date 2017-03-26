## conkLibrary
second run-through of [Grails tutorial](http://guides.grails.org/creating-your-first-grails-app/guide/index.html), changing vehicles to books (naturally)

- **Vehicle = Book**
- **Model = Author**
- **Make = Genre**

## mySQL

- Created local mysql database called 'conkLibrary' and set up the user and password. 
- Added `?useSSL=false` to the end of the mysql url in the `application.yml` file to get rid of warnings from mysql. 
See [this article from Verisign](https://www.verisign.com/en_US/website-presence/website-optimization/ssl-certificates/index.xhtml) about SSL certificates.

## IntelliJ...issues

- non-enterprise version doesn't recognize `.gsp` file extension. Set it to treat that like Groovy so we'll see how that works...Probably should have set it to html instead since DumbJ keeps flagging all the HTML syntax with warnings and errors.
