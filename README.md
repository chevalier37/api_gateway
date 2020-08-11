# api_gateway

Point d'entrée unique de l'application.

Port d'écoute : 8080

### Endpoints disponibles :
#### Récupérer la localisation d'un utilisateur : 
/user/getLocation?userName=internalUser1

#### Récupérer les informations d'un utilisateur : 
/user/getUser/internalUser1

#### Liste de tous les utilisateurs :
/user/getAllCurrentLocations

#### Récupérer les récompenses des utilisateurs :
/user/getTripDeals/internalUser1

#### Mettre à jour les récompenses des utilisateurs:
rewards/calculateRewards/internalUser1

#### Liste des attractions
/gpsutil/getAttractions

#### Liste des 5 attractions les plus proches :
/gpsutil/get5NearbyAttractions?userName=internalUser1
