<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE HTML>

<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0;">
<meta name="description" content="Daily Tintin" />
<meta name="keywords" content="Tintin, generator, quote, Herge" />
<meta name="author" content="Petteri Hamalainen" />
<title>Daily Tintin</title>
<style>

html {
  background: #fffffd;
}

html,body {
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
  font-size: 16px;
  font-family: Verdana, Geneva, sans-serif;
  line-height: 1.3;
  text-align: center;
  color: #000;
}

a {
  color: #555; 
  text-decoration : none;
  font-weight: bold;
  padding: 0px;
  text-decoration: none;
}

a:hover {
  color: #000;
  text-decoration: underline;
}

h4 {
  margin: 2px 0 0 0;
  padding: 0 40px;
  border: 0;
  outline: 0;
  font-family: Verdana, Geneva, sans-serif;
  font-size: 14px;
  font-weight: normal;
  text-align: right;
}

h3 {
  margin: 0 0 0 0;
  padding: 0 40px;
  border: 0;
  outline: 0;
  font-family: Verdana, Geneva, sans-serif;
  font-size: 10px;
  font-weight: bold;
  text-transform: uppercase;
  /*  font-style:italic;*/
  text-align: right;
}

h2 {
  margin: 0;
  padding: 8px 0 0 0;
  font-color: #000;
  text-shadow: 0px 0px 4px rgb(255, 255, 255);
  font-family: Verdana, Geneva, sans-serif;
  font-size: 20px;
  font-weight: bold;
}

.headline {
  background: url(/titleimage.png) no-repeat 20% 2px,
    url(/background.png) repeat center center;
  background-color: #DEC49D;
  color: #222;
  height: 74px;
  font-size: 14px;
  font-weight: normal;
  text-align: center;
  margin: auto;
  padding: 0;
}

.headline_bottom {
  background: url(/titleimage2.png) no-repeat 20% center;
  height: 62px;
  font-size: 10px;
  font-weight: normal;
  text-align: right;
  vertical-align: top; 
  margin : auto;
  padding: 0;
  margin: auto;
  color: #555;
}

.headline_bottom a {
  font-size: 10px;
  font-family: Arial, Helvetica, Sans-Serif;
  font-weight: normal;
  padding: 6px 6px 0 0;
  text-decoration: none;
  color: #555;
}

.headline_bottom a:hover {
  color: #000;
  text-decoration: underline;
}

.infopane {
  background: url(/scroll.png) no-repeat center center;
  height: 54px;
  line-height: 54px;
  color: #555;
  text-align: center;
  text-transform: uppercase;
  font-weight: bold;
  font-size: 12px;
  padding: 10px;
  margin: 0;
}

#error {background-color:#ffffff;border:1px solid #f00;margin:20px auto;padding: 20px;width:600px;}
#thankyou {background-color:#ffffff;border:1px solid #090;margin:20px auto;padding: 20px;width:600px;}


</style>

</head>

<body>

  <div class="headline">
    <h2>Daily Tintin</h2>
    Evergreen Quotes As Made Famous By Tintin & Co.
  </div>

  <div class="headline_bottom">
  </div>

<h2>Hey! I'd love to hear from you, send me a message.</h2>
  <form action="contact" method="post">
	  <div class="infopane">
			  Name or email: <input type="text" name="name"><br>
	  </div>
	  <div class="infopane">
			  Your message: <input type="text" name="message"><br>
	  </div>
	  <div class="infopane">  
			  <input type="submit" value="Submit">
	  </div>
  </form>
    
   <%
   String attr = (String) request.getParameter("error");
   if (attr != null && attr.equals("0")) {
   %>
   <div id="error">
     <span style="text-align:center;color:red">Both fields are required, please fill them in before sending.</span>
   </div>
   <%
   } else if (attr != null && attr.equals("1")) {
   %>
   <div id="thankyou">
     <span style="text-align:center;color:green">Thank you. I will get back to you the soonest. Now <a href="www.dailytintin.com">go back</a>.</span>
   </div>
   <%
   }
   %>
    
</body>
</html>
