module.exports = {
    css: {
        loaderOptions: {
            less: {
                javascriptEnabled: true,
                import: resolve("assets/css/style.less")
            }
        },
        pluginOptions: {
            5         "style-resources-loader": {
            6             preProcessor: "less",
            7             patterns: [path.resolve(__dirname, "less文件路径")]
            8         }
            9     }
    },
    
    devServer: {
        historyApiFallback: true
      },
    //   module: {
    //     rules: [
    //      {
    //      test: /\.less$/,
    //      loader: 'style-loader!css-loader!less-loader'
    //      },
    //      {
    //      test:/\.css$/,
    //      loader:'css-loader!style-loader',
    //      }
    //     ] 
    //     }  
}