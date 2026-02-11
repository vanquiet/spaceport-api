Spaceport API – Bonus Task (Caching)

In this bonus task, caching was added to improve system performance and reduce database load.

Spring Cache is enabled in the main application using EnableCaching.

Caching is implemented in the service layer.

The following methods use caching:

getAllPilots
getPilotById
getAllShips
getShipById

Cacheable is used for GET operations. When data is requested for the first time, it is loaded from the database and stored in memory. The next time the same request is made, the data is returned from cache instead of the database.

CacheEvict is used for POST, PUT and DELETE operations. When data is created, updated or deleted, the cache is cleared to keep data consistent.

ConcurrentMapCacheManager is used as the cache manager. It stores data in memory.

Benefits of caching:

Faster responses
Fewer database queries
Better performance

This implementation keeps clean architecture because caching is placed in the service layer and does not affect controllers or repositories.
