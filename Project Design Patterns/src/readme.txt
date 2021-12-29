Proiect Design Patterns

Design Pattern-uri folosite: Factory si Observer
Cerinta: Notificarea tuturor subscriberilor unui youtuber + reactia acestora.
Flow:
  Factory: 
	-implementam clasa abstracta Subscriber care va contine varsta publicului
	-implementam clasele Children, Teens si Adults ce reprezinta tipuri de subscriberi si varsta lor
	-implementam SubscriberFactory unde prin array-ul decarat stabilim ce tip de subscriber construim
	-folosim o exceptie in cazul in care tipul subscriberului nu poate fi recunoscut
	-in Main afisam varsta subscriberilor

 Observer:
	-implementam clasa Youtuber ce contine o lista de subscriberi si contentul pe care il posteaza. Se stabileste ce tip de content posteaza si toti subscriberii sunt notificati
	-in clasa Subscriber adaugam youtuberul si reactiile subscriberilor
	-in clasele Children, Teens si Adults implementam subscribe() care aboneaza subscriberul la youtuber si update() care adauga reactia subscriberului la contentul postat
	-in Main declaram tipuri de subscriberi prin Factory dupa care le atribuim un youtuber, iar youtuberului ii atribuim un tip de content.