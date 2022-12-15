## Singleton Design Pattern
- Singleton design pattern ile sadece bir nesne oluşur.
- Sınıf içindeki static değerler sınıfa aittir.
- Örnekte görüldüğü üzere iki kere nesne oluşturulmuştur fakat, sınıf içinde oluşturduğumuz static Singleton nesnesi tek sefer çalışır 
bu yüzden constructor'a tek bir sefer girer. Ve önceden oluşturulmuş nesneyi geri döndürür.

  ![image](https://user-images.githubusercontent.com/32744691/207962501-1603fcca-beec-4eff-b188-8c9577661726.png) -> ![image](https://user-images.githubusercontent.com/32744691/207962559-a3d0fb2b-c6b7-43f1-bf80-7157a751e8af.png)


- Ve tekrardan örnekte görüldüğü üzere aynı nesne gibi davranmaktadırlar.
- Birinin id'si değişince diğerininde değişmektedir.
