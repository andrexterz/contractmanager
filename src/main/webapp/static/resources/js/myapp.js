/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var app = angular.module("myApp", []);
var rootDir = "/contractmanager";
app.controller("myCtrl", function ($scope) {
    $scope.firstName = "John";
    $scope.lastName = "Doe";
});

app.controller("getData", function ($scope, $http) {
    $scope.id = 0;
    
    $scope.getReg = function () {
        $http.get(rootDir + "/usuario/" + $scope.id).success(function (data) {
            $scope.nomeUsuario = data.nomeUsuario;
        }).error(function (data) {
            alert("error on loading data.");
        });
    };
    
    $scope.getPrev = function () {
        $scope.id--;
        if ($scope.id <= 1) $scope.id = 1;
        $scope.getReg();
    };
    
    $scope.getNext = function () {
        $scope.id++;
        
        $scope.getReg();
    };
});