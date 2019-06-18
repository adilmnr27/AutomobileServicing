create table Booking(
  id BIGINT NOT NULL AUTO_INCREMENT,
   modificationCounter INTEGER NOT NULL,
  slotId INTEGER NOT NULL,
  make VARCHAR(255),
  model VARCHAR(255),
  fuel VARCHAR(255),
  phoneNo VARCHAR(255),
  customerName VARCHAR(255),
  dateOfBooking VARCHAR(255),
  CONSTRAINT PK_Booking PRIMARY KEY(id),
);