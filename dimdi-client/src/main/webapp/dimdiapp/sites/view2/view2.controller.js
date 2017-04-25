(function() {
	'use strict';
	
	angular.module('dimdi').controller('View2Ctrl',
			['$scope', '$log','DIMDIMainService', function($scope, $log, DIMDIMainService) {
	
		$scope.shek = DIMDIMainService.shuma();
		
	}]);
	
})();
