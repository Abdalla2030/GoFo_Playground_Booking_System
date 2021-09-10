/**
 *  
 * @author Abdalla Fadal Shehata
 *
 */
     public class User {
              private String Name;
              private String Password ;
              private String eMail ;
              private String phoneNumber;
              private String nationalID;
              private String city ;
              
          public User() 
          {
               Name = "";
               Password = "";
               eMail = "";
               phoneNumber ="";
               eMail = "";
               nationalID = "";
               city = "";
          }
          
          /**
           * 
           * @param name
           * @param password
           * @param eMail
           * @param phoneNumber
           * @param ID
           * @param city
           */
          public User(String name,String password,String eMail,String phoneNumber,String ID, String city) 
          {
             Name = name;
             Password = password;
             this.eMail = eMail;
             this.phoneNumber = phoneNumber;
             nationalID = ID ;
             this.city = city;
          }
          
          /**
           * 
           * @param name
           */
          public void setName(String name) 
          {
             Name = name;
          }
          
          /**
           * 
           * @return
           */
          public String getName() 
          {
                  return this.Name;
          }
          
          /**
           * 
           * @param password
           */
          public void setPassword(String password) 
          {
             Password = password;
          }
         
          /**
           * 
           * @return
           */
          public String getPassword() 
          {
                  return this.Password;
          }
          
          /**
           * 
           * @param Email
           */
         
          public void setEmail(String Email) 
          {
               eMail = Email;
          }
          /**
           * 
           * @return
           */
          public String getEmail() 
          {
                  return eMail;
          }
          /**
           * 
           * @param phoneNumber
           */
          public void setPhoneNumber(String phoneNumber) 
          {
              this.phoneNumber = phoneNumber;
          }
          /**
           * 
           * @return
           */
          public String getPhoneNumber()
          {
                  return phoneNumber;
          }
          /**
           * 
           * @param nationalID
           */
          public void setNationalID(String nationalID) 
          {
              this.nationalID = nationalID ;
          }
          /**
           * 
           * @return
           */
          public String getNationalID() 
          {
                  return nationalID;
          }
          /**
           * 
           * @param city
           */
          public void setCity(String city) 
          {
                  this.city = city;
          }
          /**
           * 
           * @return
           */
          public String getCity()
          {
                  return city;
          }
          
          public String toString() 
          {
              return "name: "+Name+"\n"+"Password: "+ Password+"\n";
        }
     }


