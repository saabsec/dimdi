(function() {
	'use strict';
	
	angular.module('dimdi').controller('View3Ctrl',
			[ '$log', 'DIMDIMainService', function($log, DIMDIMainService) {
				$log.info('View3Ctrl');
				
				DIMDIMainService.sherbim();
				
				
			} ]);
	
})();
