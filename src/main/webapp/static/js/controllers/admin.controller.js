'use strict';

angular.module('myApp').controller('adminController', ['$scope', 'adminService', function($scope, adminService) {
    var self = this;
    self.stadium={id:null,username:'',address:'',email:''};
    self.stadiums=[];

    self.submit = submit;
    self.edit = edit;
    self.remove = remove;
    self.reset = reset;


    function createUser(stadium){
        adminService.createStadium(stadium)
            .then(
            function(errResponse){
                console.error('Error while creating stadium');
            }
        );
    }


    function submit() {
        if(self.user.id===null){
            console.log('Saving New User', self.user);
            createUser(self.stadium);
        }
        reset();
    }

    function reset(){
        self.user={id:null,username:'',address:'',email:''};
        $scope.myForm.$setPristine(); //reset Form
    }

}]);