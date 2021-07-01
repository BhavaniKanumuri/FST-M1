class Car:
    
    
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
        
    def accelerate(self):
        print(self.manufacturer + " " + self.model + " is moving")
    
    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped")

car1 = Car("BMW" , "X7" , "2019" , "Manual" , "Black" )
car2 = Car("Audi","Q2","2017","Automatic","Blue")
car3 = Car("Bentley","Continental","2021","Automatic","Olive green")

car1.accelerate()
car1.stop()