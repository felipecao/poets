#Part 1
For CachedPoetsInfoRepository, test that:
* The first time I ask for the year of birth of a poet then the api is contacted
* The first time I ask for the year of birth of a poet then the year is saved in the cache
* The second time I ask for the year of birth of a poet then the api is not contacted
* The second time I ask for the year of birth of a poet then the year is retrieved from the cache

#Part 2
For TimeCachedPoetsInfoRepository, test that:
* If 10 minutes have passed between the first and the second time I ask for the year of birth of a poet then the api is contacted 
* If less than 10 minutes have passed between the first and the second time I ask for the year of birth of a poet then the api is not contacted 