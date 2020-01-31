class Greetings:
    def __init__(self, name):
        self.name = name

    def display(self):
        print(f'Hello there {self.name}.')


if __name__ == '__main__':
    i = input('Enter your name: ')
    g = Greetings(i)
    g.display()