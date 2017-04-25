(function() {
	'use strict';
	/**
	 * Deklaron i modulit
	 */
	var dimdiapp = angular.module('dimdi');
	
	dimdiapp.controller('View1Ctrl', [ '$scope', '$log', 'DIMDIMainService',
			function($scope, $log, DIMDIMainService) {
				$log.info('View1Ctrl');
				/**
				 * this function takes data from the server
				 */
				DIMDIMainService.getDataFromServer('greeting').then(function(result) {
					$scope.tedhenat = result;
				});
				
				$scope.printo = function() {
					$scope.shuma = DIMDIMainService.shuma();
				};
				
			} ]);
	
})();
