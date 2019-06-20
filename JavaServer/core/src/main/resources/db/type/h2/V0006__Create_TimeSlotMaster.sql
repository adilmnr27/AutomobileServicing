create table TimeSlotMaster(
  id BIGINT NOT NULL AUTO_INCREMENT,
   modificationCounter INTEGER NOT NULL,
  slotId INTEGER NOT NULL,
  duration VARCHAR(255),
  slotTime VARCHAR(255),

  CONSTRAINT PK_TimeSlotMaster PRIMARY KEY(id),
);