#Juan Ramirez
#lab #12
#CSC 321


def rectAnr(base, height):
    x = base * height
    return x

def circle(radius):
    y = radius * radius * 3.14159
    return y


a = int(input("Enter the base of the rectangle:"))
b = int(input("Enter the height of the rectangle:"))

c = int(input("Enter the radius of the circle:"))
area = rectAnr(a,b)

are2 = circle(c)

print("Area of triangle is ",area)

print("Area of the circle is ",are2)
