package JfreeChart;

import java.awt.*;
import Database.*;

import java.util.Calendar;

import javax.swing.*;

import org.jfree.chart.*;
import org.jfree.chart.axis.*;
import org.jfree.chart.labels.*;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.data.category.*;
import org.jfree.data.general.*;
import org.jfree.ui.*;

public class JChart {
	// Run As > Java Application 으로 실행하면 바로 확인할 수 있음.

	public void showPieChart(int year, int month) {

		JChart demo = new JChart();
		
		JFreeChart chart = demo.getPieChart(year, month);

		ChartFrame frame1 = new ChartFrame("지출 분석", chart);
		
		frame1.setSize(800, 400);
		frame1.setLocation(1800,200);
		frame1.setVisible(true);

	}
	
	public void showLineChart(int year,int month) {
		
		JChart demo = new JChart();
		
		JFreeChart chart = demo.getLineChart(year, month);

		ChartFrame frame1 = new ChartFrame("지출 그래프", chart);
		
		frame1.setSize(800, 400);
		frame1.setLocation(1800,200);

		frame1.setVisible(true);		
	}
	

	public JFreeChart getPieChart(int year, int month) {
		JDBCExam a = new JDBCExam();
		DefaultPieDataset dataset1 = new DefaultPieDataset(); // Pie chart

		// dataset1.addValue(a.productSum_kinds(2017, 12, 1, 1),"지출");
		String s1 = "식비";
		String s2 = "교통비";
		String s3 = "카페";
		String s4 = "생필품";
		String s5 = "문화생활";
		String s6 = "공과금";

		dataset1.setValue(s1, a.productSum_kinds(year, month, 1, 0));
		dataset1.setValue(s2, a.productSum_kinds(year, month, 1, 1));
		dataset1.setValue(s3, a.productSum_kinds(year, month, 1, 2));
		dataset1.setValue(s4, a.productSum_kinds(year, month, 1, 3));
		dataset1.setValue(s5, a.productSum_kinds(year, month, 1, 4));
		dataset1.setValue(s6, a.productSum_kinds(year, month, 1, 5));
		JFreeChart chart = ChartFactory.createPieChart("", dataset1, true, true, false);

		chart.getTitle().setFont(new Font("돋움", Font.BOLD, 14));
		chart.getLegend().setItemFont(new Font("돋움", Font.PLAIN, 10));

		PiePlot plot = (PiePlot) chart.getPlot();
		plot.setLabelFont(new Font("돋움", Font.PLAIN, 12));
		return chart;
	}

	public JFreeChart getLineChart(int year, int month) {
		JDBCExam a = new JDBCExam();

		// 데이터 생성

		DefaultCategoryDataset dataset2 = new DefaultCategoryDataset(); // line chart

		// 데이터 입력 ( 값, 범례, 카테고리 )
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		
		for (int i = 1; i <= cal.getMaximum(Calendar.DAY_OF_MONTH); i++) {
			dataset2.addValue(a.productSum_day(year, month, i, 1), "지출", Integer.toString(i));
		}

		final BarRenderer renderer = new BarRenderer();

		final BarRenderer renderer12 = new BarRenderer();

		final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();

		// 공통 옵션 정의

		final CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();

		final ItemLabelPosition p_center = new ItemLabelPosition(

				ItemLabelAnchor.CENTER, TextAnchor.CENTER

		);

		final ItemLabelPosition p_below = new ItemLabelPosition(

				ItemLabelAnchor.OUTSIDE6, TextAnchor.TOP_LEFT

		);

		Font f = new Font("Gulim", Font.BOLD, 14);

		Font axisF = new Font("Gulim", Font.PLAIN, 14);

		renderer2.setBaseItemLabelGenerator(generator);

		renderer2.setBaseItemLabelsVisible(true);

		renderer2.setBaseShapesVisible(true);

		renderer2.setDrawOutlines(true);

		renderer2.setUseFillPaint(true);

		renderer2.setBaseFillPaint(Color.WHITE);

		renderer2.setBaseItemLabelFont(f);

		renderer2.setBasePositiveItemLabelPosition(p_below);

		renderer2.setSeriesPaint(0, new Color(219, 121, 22));

		renderer2.setSeriesStroke(0, new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 3.0f)

		);

		// plot 생성

		final CategoryPlot plot = new CategoryPlot();

		// plot 에 데이터 적재

		plot.setRenderer(renderer);

		plot.setDataset(2, dataset2);

		plot.setRenderer(2, renderer2);

		// plot 기본 설정

		plot.setOrientation(PlotOrientation.VERTICAL); // 그래프 표시 방향

		plot.setRangeGridlinesVisible(true); // X축 가이드 라인 표시여부

		plot.setDomainGridlinesVisible(true); // Y축 가이드 라인 표시여부

		// 렌더링 순서 정의 : dataset 등록 순서대로 렌더링 ( 즉, 먼저 등록한게 아래로 깔림 )

		plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);

		// X축 세팅

		plot.setDomainAxis(new CategoryAxis()); // X축 종류 설정

		plot.getDomainAxis().setTickLabelFont(axisF); // X축 눈금라벨 폰트 조정

		plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.STANDARD); // 카테고리 라벨 위치 조정

		// Y축 세팅

		plot.setRangeAxis(new NumberAxis()); // Y축 종류 설정

		plot.getRangeAxis().setTickLabelFont(axisF); // Y축 눈금라벨 폰트 조정

		final JFreeChart chart = new JFreeChart(plot);

		return chart;

	}

}
