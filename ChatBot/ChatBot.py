from chatterbot import ChatBot
from chatterbot.trainers import ChatterBotCorpusTrainer

# Crea una instancia de ChatBot
chatbot = ChatBot('ChatBot')

# Entrena el chatbot con el corpus de ChatterBot
trainer = ChatterBotCorpusTrainer(chatbot)
trainer.train("chatterbot.corpus.spanish")

# Inicia el chatbot
while True:
    try:
        user_input = input('Tú: ')
        bot_response = chatbot.get_response(user_input)
        print('ChatBot:', bot_response)
    except (KeyboardInterrupt, EOFError, SystemExit):
        break