ALTER TABLE Dishes ADD COLUMN image_path VARCHAR(255);

UPDATE Dishes SET image_path = 'C:/Users/Admin/Documents/NetBeansProjects/Menu/src/image/phobo.jpg' WHERE dish_id = 1;

select * from dishes;