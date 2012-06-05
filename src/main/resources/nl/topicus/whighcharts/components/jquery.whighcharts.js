(function() {
	wHighChartsSerializeEvent = function(attrs, event) {
		attrs.ep = {
			"event.currentTarget.name" : event.currentTarget.name,
			"event.type" : event.type,
			"event.altKey" : event.altKey,
			"event.ctrlKey" : event.ctrlKey,
			"event.shiftKey" : event.shiftKey,
			"event.checked" : event.checked,
			"event.chartX" : event.chartX,
			"event.chartY" : event.chartY
 		}
		if (event.point != undefined) {
			attrs.ep["event.point.category"] = event.point.category;
			attrs.ep["event.point.config"] = event.point.config;
 		}

		if (event.xAxis != undefined && event.xAxis[0] != undefined) {
			attrs.ep["event.xAxis0.value"] = event.xAxis[0].value;
			attrs.ep["event.xAxis0.min"] = event.xAxis[0].min;
			attrs.ep["event.xAxis0.max"] = event.xAxis[0].max;
 		}

		if (event.yAxis != undefined && event.yAxis[0] != undefined) {
			attrs.ep["event.yAxis0.value"] = event.yAxis[0].value;
			attrs.ep["event.yAxis0.min"] = event.yAxis[0].min;
			attrs.ep["event.yAxis0.max"] = event.yAxis[0].max;
		}

 		return queryString;
 	};
})();
