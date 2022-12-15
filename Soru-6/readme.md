## SOA - Web Service - Restful Service - HTTP methods kavramlarını örneklerle açıklayınız.

* **SOA**, bir uygulamanın birbiriyle etkileşimini sağlamak için kullanılan bir mimaridir. Bu mimari, uygulamanın parçalara ayrılmış hizmetlerden oluştuğu bir yapıya sahiptir. Bu hizmetler, birbiriyle iletişim kurmak için standart bir arabirim kullanırlar. Örneğin, bir e-ticaret sitesi, siparişleri kaydetmek için bir veritabanı hizmeti kullanabilir ve bu hizmeti bir ödeme işlemi hizmetiyle entegre edebilir. Bu sayede, e-ticaret sitesi, veritabanı hizmetini ve ödeme işlemi hizmetini kullanarak, siparişleri kaydedebilir ve ödemeleri işleyebilir.

* **Web** servisi, internet üzerinden erişilebilen bir hizmettir. Örneğin, bir e-ticaret sitesi, ürünlerin stok durumunu kontrol etmek için bir stok durumu web servisi kullanabilir. Bu servis, bir web sunucusu üzerinde çalışarak, diğer uygulamalar tarafından kullanılmak üzere bir arabirim sunar. E-ticaret sitesi, stok durumunu web servise istek gönderir, ürünlerin stok durumunu sorgular ve kullanıcılara bu bilgiyi gösterir. 

* **Rest**, Web service yapmak için kullanılan teknolojilerden biridir. 

      @Path("/hello")
      public class HelloService {
          @GET
          @Path("/{name}")
          public Response sayHello(@PathParam("name") String name) {
              return Response.status(200).entity("Hello, " + name).build();
          }
      }
    
Bu servis, "hello" yolu altında bulunan "/{name}" yolunu dinleyecek ve bu yola bir isim ekleyerek erişildiğinde, "Hello, [isim]" şeklinde bir cevap döndürecektir. Örneğin, "/hello/John" yoluna erişildiğinde, servis "Hello, John" cevabını döndürecektir. Bu örnek, Java dilini kullanarak bir RESTful servisin nasıl oluşturulacağını göstermektedir.


* **Http Metotlar**
GET: Web sunucusundaki bir veriyi istemciye göndermek için kullanılır. Örneğin, bir web sitesindeki bir sayfa içeriğini istemciye göstermek için kullanılır.
POST: Web sunucusuna bir veri göndermek için kullanılır. Örneğin, bir web formu doldurup gönderirken kullanılır.
PUT: Web sunucusundaki bir veriyi güncellemek için kullanılır. Örneğin, bir veritabanındaki bir kaydı güncellemek için kullanılır.
DELETE: Web sunucusundaki bir veriyi silmek için kullanılır. Örneğin, bir veritabanındaki bir kaydı silmek için kullanılır.
HEAD: Web sunucusundaki bir verinin özelliklerini sorgulamak için kullanılır. Örneğin, bir dosyanın boyutunu ve tarihini sorgulamak için kullanılır.

