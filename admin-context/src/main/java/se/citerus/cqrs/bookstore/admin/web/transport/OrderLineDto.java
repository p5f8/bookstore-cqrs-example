package se.citerus.cqrs.bookstore.admin.web.transport;

import se.citerus.cqrs.bookstore.TransportObject;

public class OrderLineDto extends TransportObject {

  public IdDto bookId;

  public String title;

  public int quantity;

  public long unitPrice;

  public IdDto publisherContractId;

}
