# JDBC
### Java Database Connectivity
### JDBC API
there are different kinds of translators, just like there are different kinds of JDBC drivers. 

### Type 1 (JDBC-ODBC Bridge):
This is like a translator who uses another translator.  Your Java program talks to the JDBC-ODBC Bridge, which then talks to an ODBC driver, and that driver finally talks to the database.  It's a bit roundabout and can be slow and less reliable.  Think of it as a temporary solution.

### Type 2 (Native API):
This translator speaks some of your language and some of the database's language directly.  It's faster than Type 1 but still needs some "native" language skills (code specific to the operating system), making it less portable (it might not work on all computers).

### Type 3 (Middleware):
This is like having a translator who talks to a special "middleman" server. Your Java program talks to the middleware server, and the server then talks to the database. This adds a layer of complexity but can be useful for connecting to different databases in a standardized way.

### Type 4 (Pure Java):(Mainly Used by us)
This is the best kind of translator!  They speak only your language and the database's language directly.  No middleman, no other translators needed.  This makes them fast, reliable, and portable (they work on any computer with Java).  Java DB and MySQL Connector/J are examples of Type 4 drivers.

### Steps :- 
1. Load & entity.Register Driver
   1. Download mysql.connector.jar file
   2. Class.forName("com.mysql.cj.jdbc.Driver");
2. Create Connection
   1. Connection con = DriverManager.getConnection(url,username,password);
      1. url :- jdbc:mysql://localhost:3306/db.name
      2. username :- root
      3. password :- root
3. Create Statement
   1. PreparedStatement ps = con.prepareStatement("sqlQuery");
4. Execute SQL Statement 
   1. ResultSet <= ps.executeQuery(); // select Query 
   2. int <= ps.executeUpdate(); //insert, Update ,delete Query
5. Process the Result
6. Close the Connection
   1. ps.close();
   2. con.close();