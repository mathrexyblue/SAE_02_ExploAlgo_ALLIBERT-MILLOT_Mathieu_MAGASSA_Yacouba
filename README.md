ALLIBERT-MILLOT Mathieu

MAGASSA Yacouba

Le projet est organisé autour d’un ensemble de classes Java simples et cohérentes, réparties en trois catégories : représentation du graphe, algorithmes, et programmes de test/exécution.



Structure générale

Représentation du graphe



Arc : représente un arc sortant (destination + poids).



Arcs : liste d’arcs sortants pour un nœud.



Graphe : interface définissant les opérations minimales.



GrapheListe : implémentation en liste d’adjacence.



Algorithmes



BellmanFord : implémentation du point fixe.



Dijkstra : implémentation du plus court chemin.



Valeurs : stocke distances et parents.



Lecture des données



LireReseau : charge les fichiers STAN et construit un GrapheListe.



Programmes principaux



Main : test d’affichage du graphe.



MainBellmanFord : test de Bellman-Ford sur un petit graphe.



MainDijkstra : test de Dijkstra sur un petit graphe.



MainTransport : exécution complète sur les données STAN.



Organisation logique

Le projet suit une architecture claire :



Modélisation du graphe  

(Arc, Arcs, GrapheListe)



Calculs algorithmiques  

(BellmanFord, Dijkstra)



Stockage des résultats  

(Valeurs)



Chargement des données réelles  

(LireReseau)



Main et Test







Commande pour générer le jar

"jar cfe Projet.jar MainTransport -C out ."

