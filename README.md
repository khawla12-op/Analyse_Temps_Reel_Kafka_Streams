# Projet Kafka Streams - Collecte et Traitement des Données Météorologiques et Comptage de Clics

## Contexte du Projet
Ce projet implémente deux exercices pratiques utilisant Kafka Streams et Spring Boot :
1. Analyse de Données Météorologiques
2. Système de Comptage de Clics Utilisateurs

### Démarrage de Kafka avec Docker
```bash
# Démarrer Kafka
docker-compose up -d

# Créer les topics nécessaires
docker exec -it [id] bash

kafka-console-producer --topic weather-data --bootstrap-server localhost:9092
kafka-console-consumer --topic station-averages--bootstrap-server localhost:9092 --from-beginning --formatter kafka.tools.DefaultMessageFormatter --property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer --property value.deserializer=org.apache.kafka.common.serialization.StringDeserializer 
kafka-console-producer --topic clicks --bootstrap-server localhost:9092
kafka-console-consumer --topic click-counts--bootstrap-server localhost:9092 --from-beginning --formatter kafka.tools.DefaultMessageFormatter --property print.key=true --property print.value=true --property key.deserializer=org.apache.kafka.common.serialization.StringDeserializer --property value.deserializer=org.apache.kafka.common.serialization.StringDeserializer 
```

## Exercice 1 : Analyse de Données Météorologiques

### Objectif
Traiter des données météorologiques en temps réel :
- Filtrer les températures > 30°C
- Convertir les températures en Fahrenheit
- Calculer les moyennes par station

### Fonctionnalités Principales
- Lecture depuis le topic `weather-data`
- Transformation et filtrage des données
- Calcul des statistiques par station
- Écriture des résultats dans `station-averages`

## Exercice 2 : Système de Comptage de Clics

### Objectif
Développer une application web de suivi de clics en temps réel :
- Interface utilisateur pour enregistrer des clics
- Traitement des clics avec Kafka Streams
- API REST pour consulter les statistiques

### Fonctionnalités Principales
- Producteur Web : Envoi des clics à Kafka
- Kafka Streams : Comptage des clics par utilisateur
- API REST : Exposition des statistiques de clics



## Rapport Détaillé
Un rapport complet est disponible dans `src/main/resources/TP_Kafka_Streams_Exercice1 et 2`

## Notes Importantes
- Consultez le rapport détaillé pour plus d'informations
- Les fichiers sources de l'énoncé sont conservés pour référence
