## Factory Design Pattern

- Factory design pattern'de nesnelerin kendi sınıflarından değilde bir fabrikası varmışta ordan üretiliyormuş gibi
  üretilmesi sağlanır. Bu şekilde üretilmesinin avantajı sürekli new keydordu ile üretmek zorunda kalmamamız.
  Ve oluşturduğumuz interface ile direkt nesneyi o interface üzerinden return edebilmemiz.
- Dezavantaj olarak ise eğer çok fazla modelimiz olduğunu düşünürsek MiFabrika sınıfında çok fazla if bloğu
  gerekecektir.
- Bu dezavantajdan kaynaklı çözüm olarak ise Abstract Factory Design pattern geliştirilmiştir.
- Abstract Factory modelinde her telefon modeli için bir fabrika oluşturarak if bloklarından kurtulmuş oluruz.
- Bir kodda ne kadar çok if varsa o kod o kadar kötüdür.
