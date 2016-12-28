'use strict';

angular.module('myApp').factory('adminService',['$http','$q',function($http,$q){

     var REST_SERVICE_URI = 'http://localhost:8080/Spring4MVCAngularJSExample/admin/';
     var factory = {
             updateStadium:updateStadium
         };
      return factory;

     function createStadium(stadium) {
             var deferred = $q.defer();
             $http.put(REST_SERVICE_URI+id, stadium)
                 .then(
                 function (response) {
                     deferred.resolve(response.data);
                 },
                 function(errResponse){
                     console.error('Error while updating User');
                     deferred.reject(errResponse);
                 }
             );
             return deferred.promise;
         }
}])
