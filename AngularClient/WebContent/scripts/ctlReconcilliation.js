/*
function Recon($scope, $http) {
	$http.get('http://localhost:8080/ModelService/services/reconcilliation_service/recon/REC-015').
		success(function(data) {
			$scope.recons = data;
		});
		
		app.controller(reconMaster, function($scope, $http) {
		$http.get("http://localhost:8080/ModelService/services/reconcilliation_service/recon/REC-015")
			.then(function (response) { $scope.reconData = response.data; })
	});
}

(function() {
	var app = angular.module('recon', ['ngResource']);
	app.controller('reconMaster', function($scope, Post) {
		Post.query(function(data) {
			$scope.reconData = data;
		});
	});
})();

	var helloApp = angular.module("recon", [ 'ngResource' ]);
	helloApp.controller("reconMaster", [ '$scope', '$resource',
	function($scope, $resource) {
		//
		// Query Action Method
		//
		var UserProfiles = $resource('http://localhost:8080/ModelService/services/reconcilliation_service/recon/REC-015');
		UserProfiles.query(function(data){
			$scope.reconData = data;					
		});
	} ]);

*/

(function() { 
	$http({ method: 'GET', url: 'http://localhost:8080/ModelService/services/reconcilliation_service/recon/REC-015' }).
		  success(function (data, status, headers, config) {
		    $scope.reconData = data;
		  }).
		  error(function (data, status, headers, config) {
		    $scope.status = data;
		  });
	
})();
