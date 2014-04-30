<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE HTML>

<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Daily Tintin Quote</title>
<style>

html,body {
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
  font-size: 16px;
  font-family: Verdana, Geneva, sans-serif;
  line-height: 1.3;
  background: #555;
  color: #eee;
}

a {
  color: #555;
  text-decoration: none;
  font-weight: bold;
  padding: 0px;
}

a:hover {
  color: #000;
  text-decoration: underline;
}

h4 {
  margin: 10px 0 0 0;
  padding: 0 30px;
  border: 0;
  outline: 0;
  font-family: Verdana, Geneva, sans-serif;
  font-size: 14px;
  font-weight: normal;
  line-height: 1.3;
  text-align: right;
}

.headline {
  background: #eee;
	color: #555;
	font-size: 26px;
	font-weight: normal;
	text-align: center;
	margin: 50px auto;
	padding: 20px;
}

.infopane {
  background: #555 url(/scroll.png) no-repeat center center ;
  height: 54px;
  line-height: 54px;
  color: #555;
  text-align: center;
  text-transform:uppercase;
  font-weight: bold;
  font-size: 12px;
  padding: 10px;
  margin: 0 0 60px 0;
}

#bubbletop 
{
    background: url(/bubbletop.png) center center no-repeat #555;
    display: table;
    width: 450px;
    height: 40px;
    margin: 60px auto 0 auto;
    padding: 0;
}

#bubblebottom
{
    background: #555;
    display: table;
    width: 450px;
    height: 293px;
    color: #555;
    margin: auto;
    padding: 0;
}

span {
  display: table;
  width: 410px;
  background: #fff;
  color: #000;
  font-family: "Comic Sans MS", cursive, sans-serif;
  font-size: 22px;
  font-weight: bold;
  margin: auto;
  padding: 0 20px;
}

#copyrights a {
  font-size: 10px;
  font-family: Arial, Helvetica, Sans-Serif;
  font-weight: normal;
  margin: 0;
  padding: 6px 0 0 0;
  text-decoration: none;
  color: #eee;
}

#copyrights a:hover {
  color: #fff;
  text-decoration: underline;
}

#copyrights
{
  font-size: 10px;
  font-family: Arial, Helvetica, Sans-Serif;
  font-weight: normal;
  text-align: left;
  margin: 10px;
  white-space: nowrap;
  position: fixed;
  z-index: 1;
  bottom: 0;
}

</style>

  </head>

  <body>
  
    <div class="headline">
    Your Daily Tintin Quote
    </div>
    
    <div id="bubbletop">
    </div>
		
		<span>
	    ${quote}
	  </span>

    <div id="bubblebottom" style="background: url(${image}.png) center center no-repeat #555">
    <h4>-${name}</h4>
    </div>

    <div class="infopane">
      | &nbsp; ${votes} votes &nbsp; | &nbsp; <a href="/vote?id=${id}">vote for this quote</a> &nbsp; | &nbsp; <a href="/">new quote</a> &nbsp; |
    </div>


  <div id="copyrights"> 
  <a href="index.jsp">Another useless website by Petteri Hamalainen</a>
  </div> 
  
  </body>
</html>
