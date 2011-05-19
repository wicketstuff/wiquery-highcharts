(function() {
	wHighChartsSerializeEvent = function(event) {
		return "event.xAxis.value=" + event.xAxis.value+
			"&event.xAxis.min=" + event.xAxis.min+
			"&event.xAxis.max=" + event.xAxis.max+
			"&event.yAxis.value=" + event.yAxis.value+
			"&event.yAxis.min=" + event.yAxis.min+
			"&event.yAxis.max=" + event.yAxis.max+
			"&event.chartX=" + event.chartX+
			"&event.chartY=" + event.chartY+
			"&event.clientX=" + event.clientX+
			"&event.clientY=" + event.clientY;
	};
})();
